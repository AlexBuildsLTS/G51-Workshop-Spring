package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.BookLoan;

import java.time.LocalDate;
import java.util.List;

public interface BookLoanRepository extends JpaRepository<BookLoan, Long> {
    List<BookLoan> findByUserId(Long userId);
    List<BookLoan> findByBookId(Long bookId);
    List<BookLoan> findByReturnedFalse();
    List<BookLoan> findByDueDateBeforeAndReturnedFalse(LocalDate date);
    List<BookLoan> findByBorrowDateBetween(LocalDate startDate, LocalDate endDate);
}
