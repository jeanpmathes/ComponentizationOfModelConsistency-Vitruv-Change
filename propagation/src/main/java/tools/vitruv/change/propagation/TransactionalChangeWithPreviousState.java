package tools.vitruv.change.propagation;

import org.eclipse.emf.ecore.EObject;
import tools.vitruv.change.composite.description.TransactionalChange;

public record TransactionalChangeWithPreviousState(TransactionalChange<EObject> change, ModelSnapshot previousState) {
}
