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
public class Video extends Media {
    /** @return A new {@link Video} from the json stream. */
    public static Video fromJson(String json) {
        return fromJson(json, Video.class);
    }
}
