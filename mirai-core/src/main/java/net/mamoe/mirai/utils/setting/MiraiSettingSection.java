package net.mamoe.mirai.utils.setting;

import org.ini4j.Profile;

import java.io.Closeable;

/**
 * @author NaturalHG
 */
public interface MiraiSettingSection extends Closeable {
    void saveAsSection(Profile.Section section);
}


