package app.revanced.integrations.twitter.settings;

public class SettingsStatus {
    public static boolean changeDownloadEnabled = false;
    public static boolean enableFontMod = false;
    public static boolean hideLiveThreads = false;
    public static boolean hideBanner = false;
    public static boolean hideForyou = false;


    public static void enableDownloadFolder() { changeDownloadEnabled = true; }
    public static void enableFont() { enableFontMod = true; }

    public static void hideLiveThreads() { hideLiveThreads = true; }
    public static void hideBanner() { hideBanner = true; }
    public static void hideForYou() { hideForyou = true; }

    public static boolean enableTimelineSection(){return (hideLiveThreads || hideBanner ||hideForyou);}
    public static void load() {}
}