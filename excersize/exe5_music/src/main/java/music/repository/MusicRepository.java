package music.repository;

import music.entity.Music;

import java.util.List;

public interface MusicRepository {
boolean create(Music music);
boolean update(Music music);
Music findById(int id);
List<Music> findAll();
boolean deleteById(int id);
}
