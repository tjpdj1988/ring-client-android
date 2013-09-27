package com.savoirfairelinux.sflphone.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.savoirfairelinux.sflphone.R;

public class AboutFragment extends Fragment {
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.frag_about, parent, false);

        
        
        
        TextView link = (TextView) inflatedView.findViewById(R.id.web_site);
        String linkText = "<a href='http://sflphone.org/'>"+getResources().getString(R.string.web_site)+"</a>";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());
        getActivity().getActionBar().setTitle(R.string.menu_item_about);
        return inflatedView;
    }
    
    


}
