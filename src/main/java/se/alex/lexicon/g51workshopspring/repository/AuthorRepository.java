package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import se.alex.lexicon.g51workshopspring.entity.Author;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Override
    void deleteAllInBatch();

    List<Author> findByBooks_Id(Long bookId);

    @Override
    default void flush() {

    }

    @Override
    default <S extends Author> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Author> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    default void deleteAllInBatch(Iterable<Author> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    default Author getReferenceById(Long aLong) {
        return null;
    }

    @Override
    default <S extends Author> List<S> findAll(Example<S> example) {
        return List.of();
    }



    @Override
    default <S extends Author> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    default <S extends Author> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    default List<Author> findAll() {
        return List.of();
    }

    @Override
    default List<Author> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    default <S extends Author> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Author> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Author entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Author> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default List<Author> findAll(Sort sort) {
        return List.of();
    }

    @Override
    default Page<Author> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Author> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Author> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Author> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Author> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Author, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    List<Author> findByFirstName(String frank);

    List<Author> findByLastName(String asimov);
}
