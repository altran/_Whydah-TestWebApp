package net.whydah.sso.web.data;

public class ApplicationCredential {

    private String applicationName = "myapplicationname";
    private String applicationID = "apphkjhkjhkjh";
    private String applicationPassord = "nmnmnm,n,";


    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getApplicationPassord() {
        return applicationPassord;
    }

    public void setApplicationPassord(String applicationPassord) {
        this.applicationPassord = applicationPassord;
    }


    public String toXML() {
        if (applicationID == null) {
            return templateToken;
        } else {
            return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> \n " +
                    "<applicationcredential>\n" +
                    "    <params>\n" +
                    "        <applicationName>" + getApplicationName() + "</applicationName>\n" +
                    "        <applicationID>" + getApplicationID() + "</applicationID>\n" +
                    "        <applicationSecret>" + getApplicationPassord() + "</applicationSecret>\n" +
                    "    </params> \n" +
                    "</applicationcredential>\n";
        }
    }

    String templateToken = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> \n " +
            "<template>\n" +
            "    <applicationcredential>\n" +
            "        <params>\n" +
            "        <applicationName>" + getApplicationName() + "</applicationName>\n" +
            "            <applicationID>" + getApplicationID() + "</applicationID>\n" +
            "            <applicationSecret>" + getApplicationPassord() + "</applicationSecret>\n" +
            "        </params> \n" +
            "    </applicationcredential>\n" +
            "</template>";

}
