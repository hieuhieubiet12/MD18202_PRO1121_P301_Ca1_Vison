package thiennhph18697.fpt.poly.md18202_pro1121_p301_ca1_vison.Fragment.User;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import java.util.ArrayList;
import java.util.List;

import thiennhph18697.fpt.poly.md18202_pro1121_p301_ca1_vison.R;

public class HomeFragment extends Fragment {

//    ViewFlipper viewBanner;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
//        viewBanner=view.findViewById(R.id.slideShow);
    }
//    private void ActionViewFliper(){
//        List<String> quangcao=new ArrayList<>();

//        quangcao.add("https://lacdau.com/media/banner/04_Jul4b2820f0c4fe29e2d289589b90e47f4c.png");
//        quangcao.add("https://lacdau.com/media/banner/09_Jul9860edbd0f637428e39fde95121313ed.png");

//        for(int i=0;i<quangcao.size();i++){
//            ImageView img=new ImageView(getContext());
//            Glide.with(getContext()).load(quangcao.get(i)).into(img);
//            img.setScaleType(ImageView.ScaleType.FIT_XY);
//            viewBanner.addView(img);
//        }
//        viewBanner.setFlipInterval(2000);
//        viewBanner.setAutoStart(true);
//        Animation slive_in= AnimationUtils.loadAnimation(getContext(),R.anim.sliveshow_quangcao_in);
//        Animation slive_out= AnimationUtils.loadAnimation(getContext(),R.anim.sliveshow_quangcao_out);
//        viewBanner.setInAnimation(slive_in);
//        viewBanner.setOutAnimation(slive_out);

//    }
}
