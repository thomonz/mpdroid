package com.bender.mpdlib;

/**
 */
public class SongProgress
{
    private Integer currentTime;
    private Integer totalTime;

    public SongProgress(Integer currentTime, Integer totalTime)
    {
        this.currentTime = currentTime;
        this.totalTime = totalTime;
    }

    public Integer getCurrentTime()
    {
        return currentTime;
    }

    public Integer getTotalTime()
    {
        return totalTime;
    }

    public float getPercentCompleteAFloat()
    {
        return ((float) currentTime) / ((float) totalTime) * 100.0f;
    }

    public int getPercentComplete()
    {
        return Math.round(getPercentCompleteAFloat());
    }

    void increment()
    {
        if (totalTime == 0 || currentTime < totalTime)
        {
            currentTime++;
        }
    }

    boolean isDone()
    {
        return totalTime > 0 && currentTime == totalTime;
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "(" + currentTime + "/" + totalTime + ")";
    }
}
