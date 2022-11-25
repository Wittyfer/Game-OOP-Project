package event;

import Character.Corgi;
import Character.Background;
import Character.Wave;

public class Event
{
    public static boolean checkHit(Corgi corgi,Wave wave,int corgiSize,int waveHeight)
    {
	if(corgi.x+corgiSize>wave.x&&corgi.x<wave.x)
        {
            if(corgi.y+corgiSize>=wave.y-waveHeight)
            {
                return true;
            }
	}
	
        return false;
    }
			
    public static void gameStop(Wave[] wave,Background[] env){}
}
