package advocosoft.com.cricket.Model;

import java.io.Serializable;

public class BrowseTeamModel implements Serializable {
    String team_image,team_name;

    public String getTeam_image() {
        return team_image;
    }

    public void setTeam_image(String team_image) {
        this.team_image = team_image;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
