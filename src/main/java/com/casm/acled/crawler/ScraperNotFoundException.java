package com.casm.acled.crawler;

public class ScraperNotFoundException extends Exception {


    public ScraperNotFoundException(String domain) {
        super("No scraper found for the domain: " + domain);
    }
}
