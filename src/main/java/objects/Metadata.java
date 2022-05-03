package objects;

import java.util.List;

public class Metadata
{
    String appName;
    String appTitle;
    List<GameImage> gameImages;

    public Metadata(String appName, String appTitle, List<GameImage> gameImages)
    {
        this.appName = appName;
        this.appTitle = appTitle;
        this.gameImages = gameImages;
    }

    public String getAppName()
    {
        return appName;
    }

    public void setAppName(String appName)
    {
        this.appName = appName;
    }

    public String getAppTitle()
    {
        return appTitle;
    }

    public void setAppTitle(String appTitle)
    {
        this.appTitle = appTitle;
    }

    public List<GameImage> getGameImages()
    {
        return gameImages;
    }

    public void setGameImages(List<GameImage> gameImages)
    {
        this.gameImages = gameImages;
    }

    @Override
    public String toString()
    {
        return appTitle;
    }
}