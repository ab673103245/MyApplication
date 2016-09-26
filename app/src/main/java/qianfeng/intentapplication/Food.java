package qianfeng.intentapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2016/8/29 0029.
 */
public class Food implements Parcelable {

    private String foodname;
    private String foodColor;

    public Food(String foodname, String foodColor) {
        this.foodname = foodname;
        this.foodColor = foodColor;
    }

    public Food() {
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodColor() {
        return foodColor;
    }

    public void setFoodColor(String foodColor) {
        this.foodColor = foodColor;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodname='" + foodname + '\'' +
                ", foodColor='" + foodColor + '\'' +
                '}';
    }

    protected Food(Parcel in) {
        foodname = in.readString();
        foodColor = in.readString();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(foodname);
        dest.writeString(foodColor);
    }
}
