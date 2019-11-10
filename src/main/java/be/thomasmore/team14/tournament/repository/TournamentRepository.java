package be.thomasmore.team14.tournament.repository;

import be.thomasmore.team14.tournament.entity.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TournamentRepository extends MongoRepository<Tournament, String> {
    List<Tournament> findTournamentByGameId(@Param("gameid") String gameId);
    Tournament findTournamentById(@Param("tournamentid") String tournamentId);
    List<Tournament> findTournamentByNameContainingIgnoreCase(@Param("name") String name);
    long deleteTournamentsByGameId(@Param("gameid") String gameId);

}
