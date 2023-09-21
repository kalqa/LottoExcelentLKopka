package com.lotto.domain.resultchecker;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository {

    List<Player> saveAll(List<Player> player);

    Optional<Player> findById(String hash);
}
