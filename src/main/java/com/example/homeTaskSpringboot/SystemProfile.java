package com.example.homeTaskSpringboot;

public interface SystemProfile {
    String getProfile();


    class DevProfile implements SystemProfile {
        @Override
        public String getProfile() {
            return "Current profile is dev";
        }
    }

    class ProductionProfile implements SystemProfile {
        @Override
        public String getProfile() {
            return "Current profile is production";
        }
    }
}