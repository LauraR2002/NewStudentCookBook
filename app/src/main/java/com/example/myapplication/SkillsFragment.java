package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myapplication.databinding.FragmentSkillsBinding;


public class SkillsFragment extends Fragment {

    private com.example.myapplication.databinding.FragmentSkillsBinding binding;

   @Override
   public View onCreateView(
           LayoutInflater inflater, ViewGroup container,
           Bundle savedInstanceState
   ) {

       binding = FragmentSkillsBinding.inflate(inflater, container, false);
       return binding.getRoot();

   }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SkillsFragment.this)
                        .navigate(R.id.action_SkillsFragment_to_KnifeSkillsFragment);
            }
        });
    }
}