package medialibrary;

/*
    Author: Peter Pasieka
    Start date: 28/09/2020
    Version: v0.1
    Program Details: dunno
    Class Purpose:

*/

import java.util.Arrays;

public class MediaLibrary 
{
    
    public static Media[] media = new Media[4];
    private int nextIndex = 0;
     
    public static void main(String[] args) 
    {
        MediaLibrary library = new MediaLibrary();
        MediaLibraryTest_w3.acceptanceTest(library);
        
    }

    public MediaLibrary() 
    {}
    
    public void addMedia(Media newMedia) 
    {
            if (nextIndex < media.length)
            {
                media[nextIndex] = newMedia;
                nextIndex++;
                
            }

            /*
             * Snagged from stackoverflow - Resize an Array while keeping current elements in Java?
             */
            if (nextIndex == media.length)
            {
                media = Arrays.copyOf(media, media.length + 1);
            }

            if (nextIndex > media.length)
            {
                Arrays.sort(media);
            }
    }

    
    public void printMedia() 
    {
        for (Media i : media)
        {
            System.out.println(i);
        }
    }

    
    public Media findMedia(String mediaToFind) 
    {
        return ;   
	}

}