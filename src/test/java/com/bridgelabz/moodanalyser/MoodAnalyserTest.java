package com.bridgelabz.moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
   public MoodAnalyser analyser = new MoodAnalyser();


    @Test
    public void givenMessage_WhenSadMessage_ShouldReturnSadMood()
    {
        analyser.setMessage("i am in sad mood");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenAnyMessage_ShouldReturnHappy()
    {
        analyser.setMessage("I  am in Happy Mood");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMsgInConstructor_WhenSadMsg_ShouldReturnSadMood()
    {
        analyser.setMessage("I am in sad Mood");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Sad",mood);
    }
    @Test
    public void givenMsgInConstructor_WhenHappyMsg_ShouldReturnHappyMood()  {
        analyser.setMessage("I am in Happy Mood");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }
    @Test
    public void givenMood_IsNull_ShouldReturnMoodAnalysisNullException()  {
        analyser.setMessage(null);
        try {
             analyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL, e.type);
            System.out.println(e.getMessage() + " " + e.type);
        }
    }
    @Test
    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

        analyser.setMessage("");
        try {
            analyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.EMPTY, e.type);
            System.out.println(e.getMessage() + " " + e.type);

        }
    }
}
