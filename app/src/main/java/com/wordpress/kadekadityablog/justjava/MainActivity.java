package com.wordpress.kadekadityablog.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(quantity * 5);
    }


    public void increaseOrder(View view) {
        TextView quantityTextView = (TextView) findViewById(R.id.number_quantity_text_vie);
        this.quantity++;
        quantityTextView.setText(""+this.quantity);
    }

    public void decreaseOrder(View view) {
        if (quantity > 0){
            TextView quantityTextView = (TextView) findViewById(R.id.number_quantity_text_vie);
            this.quantity--;
            quantityTextView.setText(""+this.quantity);
        }
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.number_price_text_vie);
        String messagePrice = "Total : "+ NumberFormat.getCurrencyInstance().format(number);
        priceTextView.setText(messagePrice);
    }
}
