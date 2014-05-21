package org.graphwalker.examples.modelAPI;
import org.apache.log4j.Logger;
import org.graphwalker.Util;
import org.graphwalker.examples.modelAPI.intf.MusicQueue;
import org.graphwalker.generators.PathGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

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
  public void e_Album() throws InterruptedException {
      By element = By.linkText("Despicable me 2");
      verifyElementPresent(element);
	  driver.findElement(element).click();
//      By element = By.xpath("//div[contains(@class, 'module-row-cell') and contains(@class, 'album')]/a[contains(@class, 'secondary-text') and contains(@class, 'tooltip-for-full-text')]");
//      verifyElementPresent(element);
//      WebElement webElement = driver.findElement(element);
//      webElement.click();
  }


  /**
   * This method implements the Edge 'e_Artist'
   * 
   */
  public void e_Artist() throws InterruptedException {
      By element = By.linkText("Pharrel Williams");
      verifyElementPresent(element);
	  driver.findElement(element).click();
//      By element = By.xpath("//div[contains(@class, 'module-row-cell') and contains(@class, 'artist')]/a[contains(@class, 'secondary-text') and contains(@class, 'tooltip-for-full-text')]");
//      verifyElementPresent(element);
//      WebElement webElement = driver.findElement(element);
//      webElement.click();
  }


  /**
   * This method implements the Edge 'e_BaseURL'
   * 
   */
  public void e_BaseURL() throws InterruptedException {
      WebElement webElement;
      By element = By.xpath("//a[@class='logo-link']");
      verifyElementPresent(element);
      webElement = driver.findElement(element);
      webElement.click();
      webElement.sendKeys("\t");
  }


  /**
   * This method implements the Edge 'e_EnterBaseURL'
   * 
   */
  public void e_EnterBaseURL() {
      driver.get("http://www.grooveshark.com");
      try {
          driver.switchTo().alert().accept();
      } catch (NoAlertPresentException e) {
          System.out.println("no modal");
      }
  }


  /**
   * This method implements the Edge 'e_Filter'
   * 
   */
  public void e_Filter() throws InterruptedException {
      WebElement filterBar;
      By element = By.xpath("//input[@id='filter-search']");
      verifyElementPresent(element);
      filterBar = driver.findElement(element);
      filterBar.click();
      filterBar.clear();
      filterBar.sendKeys("pharrel\n");
  }


  /**
   * This method implements the Edge 'e_FilterAlbum'
   * 
   */
  public void e_FilterAlbum() throws InterruptedException {
      By element = By.xpath("//a[contains(@class, 'meta-text') and contains(@class, 'album')]");
      verifyElementPresent(element);
      WebElement webElement = driver.findElement(element);
      webElement.click();
  }


  /**
   * This method implements the Edge 'e_FilterArtist'
   * 
   */
  public void e_FilterArtist() throws InterruptedException {
      By element = By.xpath("//a[contains(@class, 'meta-text') and contains(@class, 'artist')]");
      verifyElementPresent(element);
      WebElement webElement = driver.findElement(element);
      webElement.click();
  }


  /**
   * This method implements the Edge 'e_FilterSong'
   * 
   */
  public void e_FilterSong() throws InterruptedException {
      By element = By.xpath("//i[contains(@class, 'icon') and contains(@class, 'song-link') and contains(@class, 'icon-link-gray-flat')]");
      verifyElementPresent(element);

      WebElement webElement = driver.findElement(element);
      Actions act = new Actions(driver);
      act.moveToElement(webElement).click();
  }


  /**
   * This method implements the Edge 'e_Search'
   * 
   */
  public void e_Search() throws InterruptedException {
      WebElement searchBar;
      By element = By.xpath("//div[@id='search-input-container']/input[@class='search']");
      verifyElementPresent(element);
      searchBar = driver.findElement(element);
      searchBar.click();
      searchBar.clear();
      searchBar.sendKeys("happy\n\t");
  }


  /**
   * This method implements the Edge 'e_SearchAlbum'
   * 
   */
  public void e_SearchAlbum() throws InterruptedException {
      By element = By.xpath("//a[contains(@class, 'meta-text') and contains(@class, 'album')]");
      verifyElementPresent(element);
      WebElement webElement = driver.findElement(element);
      webElement.click();
  }


  /**
   * This method implements the Edge 'e_SearchArtist'
   * 
   */
  public void e_SearchArtist() throws InterruptedException {
      By element = By.xpath("//a[contains(@class, 'meta-text') and contains(@class, 'artist')]");
      verifyElementPresent(element);
      WebElement webElement = driver.findElement(element);
      webElement.click();
  }


  /**
   * This method implements the Edge 'e_SearchSong'
   * 
   */
  public void e_SearchSong() throws InterruptedException {
      By element = By.xpath("//i[contains(@class, 'icon') and contains(@class, 'song-link') and contains(@class, 'icon-link-gray-flat')]");
      verifyElementPresent(element);

      WebElement webElement = driver.findElement(element);
      Assert.assertTrue(webElement != null);
      Actions act = new Actions(driver);
      act.moveToElement(webElement).click();
  }


  /**
   * This method implements the Edge 'e_Song'
   * 
   */
  public void e_Song() throws InterruptedException {
      By element = By.xpath("//i[contains(@class, 'icon') and contains(@class, 'song-link') and contains(@class, 'icon-link-gray-flat')]");
      verifyElementPresent(element);

      WebElement webElement = driver.findElement(element);
      Assert.assertTrue(webElement != null);
      Actions act = new Actions(driver);
      act.moveToElement(webElement).click();
  }


  /**
   * This method implements the Edge 'e_StartBrowser'
   * 
   */
  public void e_StartBrowser() {
      driver = new FirefoxDriver();
  }


  /**
   * This method implements the Vertex 'v_AlbumDisplay'
   * 
   */
  public void v_AlbumDisplay() throws InterruptedException {
      Thread.sleep(1000);
//      By element = By.xpath("//div[contains(@class, 'album') and contains(@class, 'main')]");
//      verifyElementPresent(element);
//      Assert.assertTrue(driver.findElement(element) != null);
//      Assert.assertTrue(driver.getCurrentUrl().matches(".*/album/.*"));
  }


  /**
   * This method implements the Vertex 'v_ArtistDisplay'
   * 
   */
  public void v_ArtistDisplay() throws InterruptedException {
      Thread.sleep(1000);
      By element = By.xpath("//div[contains(@class, 'artist') and contains(@class, 'main')]");
      verifyElementPresent(element);
      Assert.assertTrue(driver.findElement(element) != null);
      Assert.assertTrue(driver.getCurrentUrl().matches(".*/profile/.*"));
  }


  /**
   * This method implements the Vertex 'v_BaseURL'
   * 
   */
  public void v_BaseURL() {
      Assert.assertTrue(driver.getTitle().matches(".*Grooveshark.*"));
  }


  /**
   * This method implements the Vertex 'v_BrowserStarted'
   * 
   */
  public void v_BrowserStarted() {
      Assert.assertNotNull(driver);
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
  public void v_SearchResult() throws InterruptedException {
      Thread.sleep(1000);
      Assert.assertTrue(driver.getTitle().matches("^All Song Results: happy.*"));
  }


  /**
   * This method implements the Vertex 'v_SongDisplay'
   * 
   */
  public void v_SongDisplay() throws InterruptedException {
      Thread.sleep(1000);
	  new Actions(driver).doubleClick(driver.findElement(By.cssSelector("span.title.tooltip-for-full-text"))).build().perform();
//      By element = By.xpath("//div[contains(@class, 'song') and contains(@class, 'main')]");
//      verifyElementPresent(element);
//      Assert.assertTrue(driver.findElement(element) != null);
//      Assert.assertTrue(driver.getCurrentUrl().matches(".*/s/.*"));

  }


    public boolean verifyElementPresent(By element) throws InterruptedException {
        long end = System.currentTimeMillis() + 5000;
        while (System.currentTimeMillis() < end) {
            if (driver.findElements(element).size() > 0) {
                return true;
            }
            Thread.sleep(1000);
        }
        return false;
    }

}

