package ch.arpage.palliative.android.signin;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ch.arpage.palliativeappandroid.R;

import static ch.arpage.palliative.android.signin.SignInActivity.USERNAME_TAG;

public class AccountListAdapter extends ArrayAdapter<Account> {

    private Context mContext;
    private int mSize;

    /*
     * Constructor
     */
    public AccountListAdapter(@NonNull Context context, @NonNull List<Account> accountsList, int size) {
        // Invoke superclass constructor passing 0 as resourceID,
        // because we are going to inflate a custom view
        super(context, 0, accountsList);
        mContext = context;
        mSize = size;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parentView) {

        // If the view already exists, recycle it
        View rootView = convertView;
        if (rootView == null) {
            // Else, inflate the item view from the layout resource file
            rootView = LayoutInflater.from(mContext).inflate(R.layout.activity_sign_in_account_list_item, parentView, false);

        }

        TextView gln = (TextView) rootView.findViewById(R.id.gln);
        LinearLayout gln_box = (LinearLayout) rootView.findViewById(R.id.gln_box);
        ImageView newAccount = (ImageView) rootView.findViewById(R.id.add_new);
        Account currentItem = getItem(position);
        if(currentItem != null) {
            // At the end of the list we want a button "add new account"
            if(position == mSize - 1) {
                gln_box.setVisibility(View.GONE);
                newAccount.setVisibility(View.VISIBLE);
                newAccount.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent addNewAccount = new Intent(mContext, SignInActivity.class);
                        mContext.startActivity(addNewAccount);
                    }
                });
            } else {
                gln_box.setVisibility(View.VISIBLE);
                newAccount.setVisibility(View.GONE);
                final String currentAccountName = currentItem.name;
                gln.setText(currentAccountName);
                gln_box.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent useThisAccount = new Intent(mContext, SignInActivity.class);
                        useThisAccount.putExtra(USERNAME_TAG, currentAccountName);
                        mContext.startActivity(useThisAccount);
                    }
                });
            }
        }

        return rootView;
    }
}
