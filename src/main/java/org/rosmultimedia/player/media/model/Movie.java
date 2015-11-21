/**
 * This file is part of the Alfred package.
 *
 * (c) Mickael Gaillard <mick.gaillard@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.rosmultimedia.player.media.model;

import java.util.List;

/**
 *
 * @author Erwan Le Huitouze <erwan.lehuitouze@gmail.com>
 *
 */
public class Movie extends Video {
    private int setid;
    private String set;
    private String plotoutline;
    private String sorttitle;

    private List<String> showlink;
    private int top250;
    private String trailer;
    private List<String> country;
    private List<String> studio;

    private List<String> tag;
    private String tagline;
    private String imdbnumber;
    private String mpaa;

    /** @return A new {@link Movie} from the json stream. */
    public static Movie fromJson(String json) {
        return fromJson(json, Movie.class);
    }

    public int getSetid() {
        return setid;
    }
    public void setSetid(int setid) {
        this.setid = setid;
    }
    public String getSet() {
        return set;
    }
    public void setSet(String set) {
        this.set = set;
    }
    public String getPlotoutline() {
        return plotoutline;
    }
    public void setPlotoutline(String plotoutline) {
        this.plotoutline = plotoutline;
    }
    public String getSorttitle() {
        return sorttitle;
    }
    public void setSorttitle(String sorttitle) {
        this.sorttitle = sorttitle;
    }

    public List<String> getShowlink() {
        return showlink;
    }
    public void setShowlink(List<String> showlink) {
        this.showlink = showlink;
    }
    public int getTop250() {
        return top250;
    }
    public void setTop250(int top250) {
        this.top250 = top250;
    }
    public String getTrailer() {
        return trailer;
    }
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
    public List<String> getCountry() {
        return country;
    }
    public void setCountry(List<String> country) {
        this.country = country;
    }
    public List<String> getStudio() {
        return studio;
    }
    public void setStudio(List<String> studio) {
        this.studio = studio;
    }

    public List<String> getTag() {
        return tag;
    }
    public void setTag(List<String> tag) {
        this.tag = tag;
    }
    public String getTagline() {
        return tagline;
    }
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }
    public String getImdbnumber() {
        return imdbnumber;
    }
    public void setImdbnumber(String imdbnumber) {
        this.imdbnumber = imdbnumber;
    }
    public String getMpaa() {
        return mpaa;
    }
    public void setMpaa(String mpaa) {
        this.mpaa = mpaa;
    }
}
