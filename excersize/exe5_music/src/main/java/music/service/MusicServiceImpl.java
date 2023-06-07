package music.service;

import music.entity.Music;
import music.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{
    @Autowired
    MusicRepository musicRepository;
    @Override
    public boolean create(Music music) {
        return musicRepository.create(music);
    }

    @Override
    public boolean update(Music music) {
        return musicRepository.update(music);
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        return musicRepository.deleteById(id);
    }
}
