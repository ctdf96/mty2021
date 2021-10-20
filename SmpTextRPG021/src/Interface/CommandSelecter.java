package Interface;

/**
 * バトル中のコマンドを返すための共通仕様
 * @author t.morimoto
 *
 */
public interface CommandSelecter {

	/**
	 * 出現率を受け取り、コマンドを決定する
	 * @param appeaRate
	 * @return
	 */
	public int selectCommand(int attackRate);
}
