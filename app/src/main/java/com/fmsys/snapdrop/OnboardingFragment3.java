package com.fmsys.snapdrop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.fmsys.snapdrop.databinding.FragmentOnboarding3Binding;

public class OnboardingFragment3 extends Fragment {

    public OnboardingFragment3() {
        super(R.layout.fragment_onboarding_3);
    }

    @Override
    public void onViewCreated(final @NonNull View view, final Bundle savedInstanceState) {
        final FragmentOnboarding3Binding binding = FragmentOnboarding3Binding.bind(view);
        final OnboardingViewModel viewModel = new ViewModelProvider(requireActivity()).get(OnboardingViewModel.class);

        binding.description.setText(getString(R.string.onboarding_howto_summary, viewModel.getUrl().getValue()));

        binding.continueButton.setOnClickListener(v -> {
//            viewModel.launchFragment()
            startActivity(new Intent(requireContext(), MainActivity.class));
            requireActivity().finish();
        });
    }
}
