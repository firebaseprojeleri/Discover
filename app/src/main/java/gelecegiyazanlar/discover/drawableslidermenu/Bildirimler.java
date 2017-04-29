package gelecegiyazanlar.discover.drawableslidermenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Bildirimler extends Fragment {
	Button mesaj_sayisi_button;
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 
	     View view=  inflater.inflate(R.layout.bildirimler_fragment, container, false);
	     mesaj_sayisi_button = (Button) view.findViewById(R.id.button1);
		 
	     mesaj_sayisi_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MainActivity.bildirim_sayisi++;//Bildirim say�s�n� 1 asrt�r�p MainActivity deki dataChanges metodunu �a��r�yoruz.
				((MainActivity)getActivity()).dataChanges(3);
		}
		});
		 return view;
	    }

}