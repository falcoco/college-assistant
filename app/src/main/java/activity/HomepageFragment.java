package activity;

/**
 * Created by greatyhh on 1/7/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.greatyhh.helper.R;

import org.w3c.dom.Text;


public class HomepageFragment extends Fragment {

    public HomepageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), "点击卡片了解更多:)", Toast.LENGTH_SHORT).show();
        final View rootView = inflater.inflate(R.layout.fragment_homepage, container, false);

        TextView dongnan = (TextView)rootView.findViewById(R.id.dongnan);
        dongnan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://baike.baidu.com/item/%E4%B8%9C%E5%8D%97%E5%A4%A7%E5%AD%A6"));
                startActivity(intent);
                return;
            }
        });

        TextView nanda = (TextView)rootView.findViewById(R.id.nanda);
        nanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://baike.baidu.com/view/3143.htm"));
                startActivity(intent);
                return;
            }
        });

        TextView suda = (TextView)rootView.findViewById(R.id.suda);
        suda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://baike.baidu.com/view/22059.htm"));
                startActivity(intent);
                return;
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}