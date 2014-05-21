package org.graphwalker.examples.modelAPI.intf;

public interface MusicQueue {
  /**
   * This method implements the Edge 'e_Album'
   * 
   */
  public void e_Album() throws InterruptedException;



  /**
   * This method implements the Edge 'e_Artist'
   * 
   */
  public void e_Artist() throws InterruptedException;



  /**
   * This method implements the Edge 'e_BaseURL'
   * 
   */
  public void e_BaseURL() throws InterruptedException;



  /**
   * This method implements the Edge 'e_EnterBaseURL'
   * 
   */
  public void e_EnterBaseURL();



  /**
   * This method implements the Edge 'e_Filter'
   * 
   */
  public void e_Filter() throws InterruptedException;



  /**
   * This method implements the Edge 'e_FilterAlbum'
   * 
   */
  public void e_FilterAlbum() throws InterruptedException;



  /**
   * This method implements the Edge 'e_FilterArtist'
   * 
   */
  public void e_FilterArtist() throws InterruptedException;



  /**
   * This method implements the Edge 'e_FilterSong'
   * 
   */
  public void e_FilterSong() throws InterruptedException;



  /**
   * This method implements the Edge 'e_Search'
   * 
   */
  public void e_Search() throws InterruptedException;



  /**
   * This method implements the Edge 'e_SearchAlbum'
   * 
   */
  public void e_SearchAlbum() throws InterruptedException;



  /**
   * This method implements the Edge 'e_SearchArtist'
   * 
   */
  public void e_SearchArtist() throws InterruptedException;



  /**
   * This method implements the Edge 'e_SearchSong'
   * 
   */
  public void e_SearchSong() throws InterruptedException;



  /**
   * This method implements the Edge 'e_Song'
   * 
   */
  public void e_Song() throws InterruptedException;



  /**
   * This method implements the Edge 'e_StartBrowser'
   * 
   */
  public void e_StartBrowser();



  /**
   * This method implements the Vertex 'v_AlbumDisplay'
   * 
   */
  public void v_AlbumDisplay() throws InterruptedException;



  /**
   * This method implements the Vertex 'v_ArtistDisplay'
   * 
   */
  public void v_ArtistDisplay() throws InterruptedException;



  /**
   * This method implements the Vertex 'v_BaseURL'
   * 
   */
  public void v_BaseURL();



  /**
   * This method implements the Vertex 'v_BrowserStarted'
   * 
   */
  public void v_BrowserStarted();



  /**
   * This method implements the Vertex 'v_ResultFilter'
   * 
   */
  public void v_ResultFilter();



  /**
   * This method implements the Vertex 'v_SearchResult'
   * 
   */
  public void v_SearchResult() throws InterruptedException;



  /**
   * This method implements the Vertex 'v_SongDisplay'
   * 
   */
  public void v_SongDisplay() throws InterruptedException;



}

