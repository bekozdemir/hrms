package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.PositionService;
import hrms.hrms.dataAccess.abstracts.PositionDao;
import hrms.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<Position> getAll() {
		return this.positionDao.findAll();
	}

}
