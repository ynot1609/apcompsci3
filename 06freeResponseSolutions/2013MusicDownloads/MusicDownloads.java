import java.util.*;

public class MusicDownloads
{
    private ArrayList<DownloadInfo> downloadList;
    
    public MusicDownloads()
    {
        downloadList = new ArrayList<DownloadInfo>();
    }
    
    public DownloadInfo getDownloadInfo(String title)
    {
        // YOUR CODE HERE
        String name = "";
        for (DownloadInfo item : downloadList)
        {
            name = item.getTitle();
            if (name.equals(title))
            {
                return item;
            }
        }
        return null;
    }
    
    public void updateDownloads(ArrayList<String> titles)
    {
        // YOUR CODE HERE
        DownloadInfo song = null;
        for (String item : titles)
        {
            song = getDownloadInfo(item);
            if (song != null)
            {
                song.incrementTimesDownloaded();
            }
            else
            {
                DownloadInfo tune = new DownloadInfo(item);
                downloadList.add(tune);
            }
        }
    }

    public void addDownloadInfo(DownloadInfo di)
    {
        downloadList.add(di);
    }
    
    public String toString()
    {
        String playList = "";
        for (DownloadInfo item : downloadList)
        {
            playList += item.getTitle() + " ";
            playList += item.getDownloads() + "\n";
        }
        return playList;
    }
}
