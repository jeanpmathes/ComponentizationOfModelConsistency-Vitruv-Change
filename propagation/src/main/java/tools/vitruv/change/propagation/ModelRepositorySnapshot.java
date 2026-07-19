package tools.vitruv.change.propagation;

import org.eclipse.emf.ecore.EObject;
import tools.vitruv.change.utils.ResourceAccess;

import java.util.Optional;

public interface ModelRepositorySnapshot extends ResourceAccess, AutoCloseable {
    ModelRepositorySnapshot copy();

    Optional<EObject> getRepositoryEObject(EObject snapshotEObject);

    Optional<EObject> getSnapshotEObject(EObject repositoryEObject);

    void registerEObjectMapping(EObject repositoryEObject, EObject snapshotEObject);
}
