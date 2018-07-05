package portal_xml.portal_xml.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portal_xml.portal_xml.Entity.Jaxb.Forecast.Forecast;

import java.sql.Date;
import java.util.List;

@Repository
public interface ForecastRepository extends JpaRepository<Forecast, Long> {

    List<Forecast> findTop7ByCapitalIso2CodeOrderByForecastDateAsc(String code);

    Forecast findByCapitalIso2CodeAndAndForecastDate(String code, Date date);
}
