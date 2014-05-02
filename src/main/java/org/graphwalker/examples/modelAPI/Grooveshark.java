package org.graphwalker.examples.modelAPI;
import org.apache.log4j.Logger;
import org.graphwalker.Util;
import org.graphwalker.examples.modelAPI.intf.MusicQueue;
import org.graphwalker.generators.PathGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Grooveshark extends org.graphwalker.multipleModels.ModelAPI implements MusicQueue {
  private static Logger logger = Util.setupLogger(Grooveshark.class);

    WebDriver driver = null;

  public Grooveshark(File model, boolean efsm, PathGenerator generator, boolean weight) {
    super(model, efsm, generator, weight);
  }


  /**
   * This method implements the Edge 'e_Album'
   * 
   */
  public void e_Album() {
  }


  /**
   * This method implements the Edge 'e_Artist'
   * 
   */
  public void e_Artist() {
  }


  /**
   * This method implements the Edge 'e_BaseURL'
   * 
   */
  public void e_BaseURL() {
  }


  /**
   * This method implements the Edge 'e_EnterBaseURL'
   * 
   */
  public void e_EnterBaseURL() {
  }


  /**
   * This method implements the Edge 'e_Filter'
   * 
   */
  public void e_Filter() {
  }


  /**
   * This method implements the Edge 'e_FilterAlbum'
   * 
   */
  public void e_FilterAlbum() {
  }


  /**
   * This method implements the Edge 'e_FilterArtist'
   * 
   */
  public void e_FilterArtist() {
  }


  /**
   * This method implements the Edge 'e_FilterSong'
   * 
   */
  public void e_FilterSong() {
  }


  /**
   * This method implements the Edge 'e_Search'
   * 
   */
  public void e_Search() {
  }


  /**
   * This method implements the Edge 'e_SearchAlbum'
   * 
   */
  public void e_SearchAlbum() {
  }


  /**
   * This method implements the Edge 'e_SearchArtist'
   * 
   */
  public void e_SearchArtist() {
  }


  /**
   * This method implements the Edge 'e_SearchSong'
   * 
   */
  public void e_SearchSong() {
  }


  /**
   * This method implements the Edge 'e_Song'
   * 
   */
  public void e_Song() {
  }


  /**
   * This method implements the Edge 'e_StartBrowser'
   * 
   */
  public void e_StartBrowser() {
  }


  /**
   * This method implements the Vertex 'v_AlbumDisplay'
   * 
   */
  public void v_AlbumDisplay() {
  }


  /**
   * This method implements the Vertex 'v_ArtistDisplay'
   * 
   */
  public void v_ArtistDisplay() {
  }


  /**
   * This method implements the Vertex 'v_BaseURL'
   * 
   */
  public void v_BaseURL() {
  }


  /**
   * This method implements the Vertex 'v_BrowserStarted'
   * 
   */
  public void v_BrowserStarted() {
      driver = new FirefoxDriver();
  }


  /**
   * This method implements the Vertex 'v_ResultFilter'
   * 
   */
  public void v_ResultFilter() {
  }


  /**
   * This method implements the Vertex 'v_SearchResult'
   * 
   */
  public void v_SearchResult() {
  }


  /**
   * This method implements the Vertex 'v_SongDisplay'
   * 
   */
  public void v_SongDisplay() {
  }


}

