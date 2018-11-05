package ch.arpage.palliative.android.signin;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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
        for (Account account : accounts) {
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
        final TextView popup = (TextView) findViewById(R.id.popUp);
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
        if (selectedUsername != null) {
            editText1.setText(selectedUsername);
        }

        AccountManager accountManager = AccountManager.get(this);
        Account[] accounts = accountManager.getAccountsByType(getString(R.string.account_type));
        final int numberOfAccounts = accounts.length;
        final String first_account_name = accounts[0].name;
        if (numberOfAccounts > 0) {
            editText1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    popup.setVisibility(View.VISIBLE);
                    if (numberOfAccounts == 1) {
                        popup.setText(first_account_name);
                        popup.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                editText1.setText(first_account_name);
                                popup.setVisibility(View.GONE);

                            }
                        });
                    } else {
                        popup.setText("Select account");
                        popup.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent pickYourAccount = new Intent(view.getContext(), AccountPickerActivity.class);
                                startActivity(pickYourAccount);
                            }
                        });
                    }
                }
            });
        }
    }
}
