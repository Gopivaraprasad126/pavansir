/*package windowCheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindownoCheck {
	    public static void main(String[] args) {
	        // Set the path to your WebDriver (replace with your actual path)

	        // Initialize the WebDriver (Chrome in this case)
	        WebDriver driver = new ChromeDriver();

	        // Open the webpage with the links
	        driver.get("https://google.com");

	        // Find all the links on the webpage
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        // Get the total number of anchor elements (links)
	        int totalLinks = allLinks.size();
	        System.out.println("Total number of anchor elements (links): " + totalLinks);

	        // Variable to track the index of the 'xyz' link
	        int GmailLinkIndex = -1;  // -1 means not found yet

	        // Iterate over each link to find the one with text 'xyz'
	        for (int i = 0; i < allLinks.size(); i++) {
	            WebElement link = allLinks.get(i);
	            
	            // Check if the link's visible text is 'xyz'
	            if (link.getText().equals("Gmail")) {
	                // Get the position of the link (index)
	                GmailLinkIndex = i + 1;  // Add 1 to make it 1-based index
	                
	                // Print the link details
	                String url = link.getAttribute("href");
	                System.out.println("Found the link with text 'Gmail' at position: ");
	                System.out.println("URL of the 'Gmail' link: " + url);
	                
	                break;  // Stop searching after finding the link
	            }
	        }

	        // If the link was not found, notify the user
	        if (GmailLinkIndex == -1) {
	            System.out.println("The link with text 'Gmail' was not found.");
	        }

	        // Close the browser
	        driver.quit();
	    }
	}
*/
