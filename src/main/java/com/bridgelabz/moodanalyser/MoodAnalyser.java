package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public MoodAnalyser() {

    }

    String message;

    public void setMessage(String message) {

        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {

            if (this.message.contains("sad")) {
                return "Sad";
            }
                return "Happy";

        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL, "Enter Proper Message. NULL Not Allowed");
        }
    }
}
