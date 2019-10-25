package be.thomasmore.team14.tournament.repository;

import be.thomasmore.team14.tournament.entity.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TournamentRepository extends MongoRepository<Tournament, String> {
}
