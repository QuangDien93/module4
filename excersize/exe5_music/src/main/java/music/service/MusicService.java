package music.service;

import music.entity.Music;

import java.util.List;

public interface MusicService {
    boolean create(Music music);
    boolean update(Music music);
    Music findById(int id);
    List<Music> findAll();
    boolean deleteById(int id);
}
