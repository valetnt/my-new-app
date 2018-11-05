package ch.arpage.palliative.android.signin;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;

import ch.arpage.palliativeappandroid.R;

public class AccountPickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_account_picker);

        AccountManager accountManager = AccountManager.get(this);
        Account[] accounts = accountManager.getAccountsByType(getString(R.string.account_type));
        // Put all the existing accounts into an array list
        ArrayList<Account> accountsArrayList = new ArrayList<Account>();
        for(Account account : accounts) {
            accountsArrayList.add(account);
        }
        // Add an empty account to the list, which will only serve as a placeholder
        // for the button "add new account" at the end of the list
        accountsArrayList.add(new Account("new Account", getString(R.string.account_type)));
        ListAdapter adapter = new AccountListAdapter(this, accountsArrayList, accountsArrayList.size());
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
    }
}
