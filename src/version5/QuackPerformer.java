

package version5;

/**
 *
 * @author neilkenney
 */
public interface QuackPerformer extends Duck{
    
    public abstract void performQuack();
    public abstract void setQuackBehavior(QuackBehavior qb);
}
