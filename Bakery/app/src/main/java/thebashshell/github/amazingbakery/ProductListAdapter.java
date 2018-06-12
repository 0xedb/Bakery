package thebashshell.github.amazingbakery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.PictureDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ProductListAdapter extends ArrayAdapter<Product> {
    private  final int resource;

    public ProductListAdapter(@NonNull Context context, int resource, @NonNull Product[] products) {
        super(context, resource, products);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(resource, null);
        }

        Product product = getItem(position);

        if(product != null) {
            ImageView imageView = view.findViewById(R.id.product_image);
            TextView textView = view.findViewById(R.id.product_description);
            TextView textView1 = view.findViewById(R.id.product_price);

            textView.setText(product.getDescription());
            textView1.setText("$" + Double.toString(product.getPrice()));
            imageView.setImageDrawable(product.getImage());

        }

        return view;
        //return super.getView(position, convertView, parent);
    }
}
