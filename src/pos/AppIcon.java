
package pos;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 * Loads the Ransalu logo/icon images that are bundled inside the
 * pos/resources/ folder (and therefore inside POS.jar), scaled to
 * whatever size the caller needs.
 */
public class AppIcon {

    private static final String FULL_LOGO = "/pos/resources/logo.png";
    private static final String ICON_ONLY = "/pos/resources/logo_icon.png";

    /** Full logo (needle + thread swirl + "RANSALU / Fabrics that inspire"), scaled to a square of the given size. */
    public static ImageIcon fullLogo(int size) {
        return loadScaled(FULL_LOGO, size);
    }

    /** Just the needle + thread mark, no wordmark - good for small window icons. */
    public static ImageIcon iconOnly(int size) {
        return loadScaled(ICON_ONLY, size);
    }

    /** Raw java.awt.Image version of the icon-only mark, for JFrame.setIconImage(). */
    public static Image windowIcon(int size) {
        ImageIcon icon = iconOnly(size);
        return icon == null ? null : icon.getImage();
    }

    private static ImageIcon loadScaled(String resourcePath, int size) {
        try {
            URL url = AppIcon.class.getResource(resourcePath);
            if (url == null) {
                return null;
            }
            Image img = new ImageIcon(url).getImage();
            Image scaled = img.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            return new ImageIcon(scaled);
        } catch (Exception ex) {
            return null;
        }
    }
}
