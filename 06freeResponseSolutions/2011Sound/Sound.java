//----------------------------------------------------------
// File Name:	Sound.java
// Description:	2011 AP Free Response Question 1.
// Programmer:	Alwin Tareen
// Last Edited:	Apr 01, 2015
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac Sound.java
// Execution:	<non-executable>
//----------------------------------------------------------

public class Sound
{
    private int[] samples;

    public Sound(int[] clips)
    {
        samples = clips;
    }

    public int limitAmplitude(int limit)
    {
        int count = 0;
        for (int i = 0; i < samples.length; i++)
        {
            if (Math.abs(samples[i]) > limit)
            {
                if (samples[i] < 0)
                    samples[i] = -limit;
                else
                    samples[i] = limit;
                count++;
            }
        }
        return count;
    }

    public void trimSilenceFromBeginning()
    {
        int j = 0;
        while (samples[j] == 0)
        {
            j++;
        }
        // size of the new array
        int size = samples.length - j;
        int[] trimmed = new int[size];
        for (int i = j, k = 0; i < samples.length; i++,k++)
        {
            trimmed[k] = samples[i];
        }
        samples = trimmed;
    }

    public String toString()
    {
        String result = "";
        for (int item : samples)
        {
            result += item + " ";
        }
        return result;
    }
}


