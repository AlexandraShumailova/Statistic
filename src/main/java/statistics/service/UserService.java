package statistics.service;

import reactor.core.publisher.Flux;

public interface UserService {
    Flux<String> getAllNotUserIds();
}
