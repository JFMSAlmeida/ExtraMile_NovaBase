import React, { Component } from 'react';


class Transaction extends Component {
    render(){
        const transactions = this.props.transactions;

        const transactionsArray = transactions.map(transaction => {
            return (
                <tr>
                    <td>{transaction.reference}</td>
                    <td>{transaction.type}</td>
                    <td>{transaction.value}</td>
                    <td>{transaction.time}</td>
                </tr>

            );
        });

        console.log(transactions.length);
        return (
            <div>
                {this.props.couldFetchTransactions ?
                    (transactions.length !== 0) ?
                        <table className="table table-hover">
                            <thead>
                                <tr>
                                    <th>Reference</th>
                                    <th>Type</th>
                                    <th>Value</th>
                                    <th>Time</th>
                                </tr>
                            </thead>
                            <tbody>
                                <React.Fragment>
                                    {transactionsArray}
                                </React.Fragment>
                            </tbody>
                        </table>
                        :
                        <span>
                            No transactions to show.
                        </span>
                    :
                    (transactions.length !== 0) ?
                        <span>
                            Invalid Iban
                        </span>
                        :
                        <span>
                            Bank Server Down
                        </span>
                }
            </div>
        )

    }
}

export default Transaction;