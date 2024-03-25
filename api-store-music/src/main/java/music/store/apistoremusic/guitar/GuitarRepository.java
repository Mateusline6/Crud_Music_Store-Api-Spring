package music.store.apistoremusic.guitar;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuitarRepository extends JpaRepository< Guitar,Long> {

        Page<Guitar>findAllByAtivoTrue(Pageable paginacao);
}
