package com.bridgelabz.moodanalyser;

public  class MoodAnalyserException extends RuntimeException {
        public enum ExceptionType {
            NULL, EMPTY
        }
        public ExceptionType type;
        public MoodAnalyserException(ExceptionType type,String message) {
            super(message);
            this.type = type;
        }

}
