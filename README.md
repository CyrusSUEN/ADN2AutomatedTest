# ADN2AutomatedTest

Steps to run:

1. Build Chrome and Opera version of AdNauseam extension file. (See: https://developer.chrome.com/extensions/packaging#creating) There should be extension files generated in '/AdNauseam2/dist/build/adnauseam.chromium.crx' and '/AdNauseam2/dist/build/adnauseam.opera.nex'. And assumming the path of ADN2AutomatedTest repo is next to AdNauseam2's.
2. For Firefox make a new profile with AdNauseam preinstalled called 'cfxo' (See: https://support.mozilla.org/en-US/kb/profile-manager-create-and-remove-firefox-profiles, https://github.com/dhowe/AdNauseam2/issues/9#issuecomment-186898211)

2. In Eclipse project explorer, right click > "Run as JUnit test" for each file under src/test
