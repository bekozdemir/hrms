package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
}
