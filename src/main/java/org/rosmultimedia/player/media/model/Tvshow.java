/**
 * This file is part of the Alfred package.
 *
 * (c) Mickael Gaillard <mick.gaillard@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.rosmultimedia.player.media.model;

/**
 *
 * @author Erwan Le Huitouze <erwan.lehuitouze@gmail.com>
 *
 */
public class Tvshow extends Video {
    private int episode;
    private int season;
    private int tvshowid;
    //object uniqueid
    private String showtitle;
    private String firstaired;
    private String productioncode;

    /** @return A new {@link Tvshow} from the json stream. */
    public static Tvshow fromJson(String json) {
        return fromJson(json, Tvshow.class);
    }

    public int getEpisode() {
        return episode;
    }
    public void setEpisode(int episode) {
        this.episode = episode;
    }
    public int getSeason() {
        return season;
    }
    public void setSeason(int season) {
        this.season = season;
    }
    public int getTvshowid() {
        return tvshowid;
    }
    public void setTvshowid(int tvshowid) {
        this.tvshowid = tvshowid;
    }
    public String getShowtitle() {
        return showtitle;
    }
    public void setShowtitle(String showtitle) {
        this.showtitle = showtitle;
    }
    public String getFirstaired() {
        return firstaired;
    }
    public void setFirstaired(String firstaired) {
        this.firstaired = firstaired;
    }
    public String getProductioncode() {
        return productioncode;
    }
    public void setProductioncode(String productioncode) {
        this.productioncode = productioncode;
    }
}
