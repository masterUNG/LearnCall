package appewtc.masterung.learncall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by masterUNG on 4/6/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    private Context context;
    private int[] intIcon;

    public MyAdapter(Context context, int[] intIcon) {
        this.context = context;
        this.intIcon = intIcon;
    }   // Constructor

    @Override
    public int getCount() {
        return 16;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //Show Icon
        ImageView objImageView = (ImageView) view.findViewById(R.id.imageView);
        objImageView.setBackgroundResource(intIcon[i]);
        return view1;
    }
}   // Main Class
