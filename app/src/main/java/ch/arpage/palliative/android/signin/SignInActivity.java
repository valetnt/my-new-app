package ch.arpage.palliative.android.signin;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import ch.arpage.palliativeappandroid.R;
import io.swagger.client.auth.HttpBasicAuth;


public class SignInActivity extends AppCompatActivity {

    static final String USERNAME_TAG = "username";

    static final String LOG_TAG = SignInActivity.class.getSimpleName();

    public void addUsernamePassword(String username, String password) {
        HttpBasicAuth authenticator = new HttpBasicAuth();
        authenticator.setUsername(username);
        authenticator.setPassword(password);
    }

    public void addNewAccountIfNew(String username, String password) {
        AccountManager accountManager = AccountManager.get(this);
        Account[] accounts = accountManager.getAccountsByType(getString(R.string.account_type));
        boolean isNew = true;
        Log.i(LOG_TAG, "Account type: " + getString(R.string.account_type));
        for (Account account : accounts) {
            Log.i(LOG_TAG, "Account: " + account.name + " : " + account.type);
            if (account.name.equals(username)) {
                isNew = false;
            }
        }
        if (isNew) {
            Account newAccount = new Account(username, getString(R.string.account_type));
            accountManager.addAccountExplicitly(newAccount, password, null);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        Button button = (Button) findViewById(R.id.button);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editText1.getText().toString();
                String password = editText2.getText().toString();
                addUsernamePassword(username, password);
                addNewAccountIfNew(username, password);
            }
        });

        String selectedUsername = getIntent().getStringExtra(USERNAME_TAG);
        // Check if there is an intent from AccountPickerActivity.
        // If yes, then use it. Else, proceed with the check on the existing accounts.
        if (selectedUsername != null) {

            editText1.setText(selectedUsername);

        }
            AccountManager accountManager = AccountManager.get(this);
            Account[] accounts = accountManager.getAccountsByType(getString(R.string.account_type));
            int numberOfAccounts = accounts.length;
            // If multiple accounts already exist, allow the user to pick one by sending an explicit
            // intent to the activity AccountPickerActivity.java
            if (numberOfAccounts > 1) {
                spinner.setVisibility(View.VISIBLE);
                spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                });
                Intent pickYourAccount = new Intent(this, AccountPickerActivity.class);
                startActivity(pickYourAccount);
            }
    }
}
